from dotenv import load_dotenv
import os
from openai import OpenAI
from rich import print
from pydantic import BaseModel, Field


class CityInfo(BaseModel):
    city: str = Field(..., description="Name of the city")
    population: int = Field(..., description="Population of the city")
    area: float = Field(...,
                        description="Area of the city in square kilometers")
    density: float = Field(...,
                           description="Population density per square kilometer")
    postal_code: str = Field(..., description="Postal code of the city")


load_dotenv()

TOKEN = os.getenv("GH_TOKEN")
ENDPOINT = "https://models.github.ai/inference"
MODEL_NAME = "openai/gpt-4.1-nano"

client = OpenAI(
    base_url=ENDPOINT,
    api_key=TOKEN,
)

user_message = """
Miestas Anykščiai
Šalis    Lietuva
Regionas Utenos apskritis
Valstybė	Lietuvos vėliava Lietuva
Savivaldybė	Anykščių rajono savivaldybė Anykščių rajono savivaldybė
Gyventojų (2025)	8 644 361 [1]
Plotas	1155,44 km²
Tankumas (2025)	731 žm./km²
Pašto kodas	LT-29001
 Vikiteka	Anykščiai"""

response = client.chat.completions.parse(
    model=MODEL_NAME,
    messages=[
        {"role": "system", "content": "You are a helpful assistant. You should provide us with structured output for cities. You should parse data blindly from the user input."},
        {"role": "user", "content": user_message}
    ],
    response_format=CityInfo
)

print(response.choices[0].message.parsed)
