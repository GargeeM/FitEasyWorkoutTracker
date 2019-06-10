function workPlanFunc()
{
	if(document.getElementById('light').checked == true) {
  	document.bioform.action ="lightworkoutplan.html";
	}
	else if(document.getElementById('heavy').checked == true) {
  	document.bioform.action ="lightworkoutplan.html";
	}
	return true;
}