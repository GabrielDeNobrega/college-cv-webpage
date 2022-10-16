export type User = {
    id: number;
    fullName: string;
    pictureLink: string;
    email: string;
    cellPhone: string;
    location: string;
    goal: string;
    linkedInLink: string;
    gitHubLink: string;
    professionalExperiences: Array<ProfessionalExperience>;
    educationalExperiences: Array<EducationalExperience>;
    skills: Array<Skill>;
    languages: Array<Language>;
}

export type ProfessionalExperience = {
    id: number;
    jobPosition: string;
    since: number;
    until: number;
    description: string;
}

export type EducationalExperience = {
    id: number;
    institution: string;
    courseName: string;
    graduationYear: number;
}

export type Skill = {
    id: number;
    name: string;
}

export type Language = {
    id: number;
    name: string;
    speaking: string;
    reading: string;
    writing: string;
    listening: string;
}

