printjson(
db.people.find(

	{birth_date:{"$gte": '2000-01-01'}},
	{first_name:1,last_name:1,"location.city":1}

).sort({birth_date:1}).toArray()
);