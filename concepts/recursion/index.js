let API_TOKEN = "gghbsdighbu6sdg415sdg";
let retryCount = 0;
function fetchData() {
	try {
		const result = data(API_TOKEN);
		if (!result.success) throw new Error(result.message);
		return result;
	} catch (error) {
		if (error.message === "Invalid API Token" && retryCount < 2) {
			console.error(`${retryCount + 1}. Invalid API Token, retrying...`);
			fetchGoodToken();
			retryCount++;
			const newResult = fetchData();
			if (newResult.success) {
				return newResult;
			}
		}
	}
}

function data(apiToken) {
	if (apiToken === "1c56a1b6a51ebab1af46ca")
		return { sucess: true, electricity: 100, gas: 50, water: 30 };
	else return { success: false, message: "Invalid API Token" };
}

function fetchGoodToken() {
	API_TOKEN = "1c56a1b6a51ebab1af46ca";
}
