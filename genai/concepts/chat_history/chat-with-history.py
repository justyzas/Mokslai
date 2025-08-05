from dotenv import load_dotenv
import os
from openai import OpenAI
from rich import print
load_dotenv()

TOKEN = os.getenv("GH_TOKEN")
ENDPOINT = "https://models.github.ai/inference"
MODEL_NAME = "openai/gpt-4.1-nano"

client = OpenAI(
    base_url=ENDPOINT,
    api_key=TOKEN,
)

messages = [
    {
        "role": "developer",
        "content": "You are a helpful assistant. You should answer questions in one word if possible. Use less words if possible.",
    }
]

while True:
    user_input = input("You: ")
    if user_input.lower() == "exit":
        break

    messages.append({"role": "user", "content": user_input})

    response = client.chat.completions.create(
        model=MODEL_NAME,
        messages=messages
    )
    messages.append(response.choices[0].message)

    print("Assistant:", response.choices[0].message.content)
    print(messages)
