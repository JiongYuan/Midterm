package com.cisc181.core;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID CourseID, UUID Semester, int RoomID,UUID sectionid){
		this.CourseID = CourseID;
		this.SemesterID = Semester;
		this.SectionID = sectionid;
		this.RoomID = RoomID;
		}
	
	public UUID getCourseID() {
		return CourseID;
		}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
		}
	public UUID getSemester() {
		return SemesterID;
		}
	public void setSemester(UUID semester) {
		SemesterID = semester;
		}
	public UUID getSectionID() {
		return SectionID;
		}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
		}
	public int getRoomID() {
		return RoomID;
		}
	public void setRoomID(int roomID) {
		RoomID = roomID;
		}
}
