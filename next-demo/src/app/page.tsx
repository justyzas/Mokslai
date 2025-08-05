export default function Home() {
	return (
		<>
			<table>
				<thead>
					<tr>
						<th>action id</th>
						<th>date</th>
						<th>action type</th>
						<th>action taker</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>2023-10-01</td>
						<td>action.actionType</td>
						<td>
							{" "}
							<UserChip /> user123| <ApiChip /> apiKeyName123
						</td>
						<div></div>
					</tr>
				</tbody>
			</table>
		</>
	);
}

function UserActionComponent({ data }: { data: Action }) {
	if (data instanceof UserActionLogin) {
		return <UserActionLoginComponent data={data} />;
	} else if (data instanceof UserActionFileUpload) {
		return <UserActionFileUploadComponent data={data} />;
	} else {
		return <div>Unknown action type</div>;
	}
}

function UserActionLoginComponent({ data }: { data: UserActionLogin }) {
	return <div></div>;
}
function UserActionFileUploadComponent({
	data,
}: {
	data: UserActionFileUpload;
}) {
	return <div></div>;
}

type ActionDataRaw = {
	id: number;
	date: Date;
	actionType: string;
	actionTaker: string;
	metadata: any;
};

class Action {
	id: number;
	date: Date;
	actionType: string;
	actionTaker: string;

	constructor(data: ActionDataRaw) {
		this.id = data.id;
		this.date = data.date;
		this.actionType = data.actionType;
		this.actionTaker = data.actionTaker;
	}
}

class UserActionLogin extends Action {
	wasLoginSuccessful: boolean;

	constructor(data: ActionDataRaw) {
		super(data);
		this.wasLoginSuccessful = data.metadata.wasLoginSuccessful;
	}
}

class UserActionFileUpload extends Action {
	fileName: string;
	fileSize: number;

	constructor(data: ActionDataRaw) {
		super(data);
		this.fileName = data.metadata.fileName;
		this.fileSize = data.metadata.fileSize;
	}
}

function actionFactory(data: ActionDataRaw): Action {
	if (data.actionType === "login") {
		return new UserActionLogin(data);
	} else if (data.actionType === "fileUpload") {
		return new UserActionFileUpload(data);
	} else {
		return new Action(data);
	}
}
