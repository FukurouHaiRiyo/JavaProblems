/* In this exercise, you will be working on creating a student management system
using Rust. The system should allow you to store and retrieve student information
based on their unique ID. For ease of work, the student structure is already
created in the code below

Next, create a StudentManager structure containing a field of student, which
will essentially be a hashmap where the key part will be an integer representing
unique ID of student and the value part will be the complete details of the
students contained in the student structure.

The StudentManager should implement the following methods:
1. new() -> Self: A constructor that initializes an empty student manager.

2. add_student(&mut self, student: Student) -> Result<(), String>:
Adds a student to the manager.
If the student's ID already exists, return an error message.
Otherwise, add the student to the manager and return Ok.

3. get_student(&self, id: i32) -> Option<&Student>: Retrieves a student
from the manager based on their ID.
If the student is found, return Some(student). Otherwise, return None.

Your task is to implement the StudentManager structure, and the mentioned methods.
Additionally, provide a sample usage of the student management system by adding
a few students and retrieving their information using the get_student() method.
*/

struct Student {
    id: i32,
    name: String,
    age: i32,
    grade: String,
}

struct StudentManager {
    students: std::collections::HashMap<i32, Student>,
}

impl StudentManager {
    fn new() -> Self {
        StudentManager {
            students: std::collections::HashMap::new(),
        }
    }

    fn add_student(&mut self, student: Student) -> Result<(), String> {
        if self.students.contains_key(&student.id) {
            return Err("Student ID already exists".to_string());
        }
        self.students.insert(student.id, student);
        Ok(())
    }

    fn get_student(&self, id: i32) -> Option<&Student> {
        self.students.get(&id)
    }

    fn print_students(&self) {
        for(id, student) in &self.students {
            println!("ID: {}, Name: {}, Age: {}, Grade: {}", id, student.name, student.age, student.grade);
        }
    }
}

fn main() {
    let mut student_manager = StudentManager::new();

    let student1 = Student {
        id: 1,
        name: "John".to_string(),
        age: 20,
        grade: "A".to_string(),
    };

    let student2 = Student {
        id: 2,
        name: "Jane".to_string(),
        age: 21,
        grade: "B".to_string(),
    };

    student_manager.add_student(student1).unwrap();
    student_manager.add_student(student2).unwrap();

    student_manager.print_students();

    match student_manager.get_student(1) {
        Some(student) => println!("Student found: {}", student.name),
        None => println!("Student not found"),
    }

    match student_manager.get_student(3) {
        Some(student) => println!("Student found: {}", student.name),
        None => println!("Student not found"),
    }
}
