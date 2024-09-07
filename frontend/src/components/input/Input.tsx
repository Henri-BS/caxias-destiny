import React from "react";

interface InputTextProps {
    style?: string;
    onChange?: (event: React.ChangeEvent<HTMLInputElement> | React.ChangeEvent<HTMLTextAreaElement>) => void;
    placeholder?: string;
    id?: string;
}



export const InputText: React.FC<InputTextProps> = ({
    id, onChange, style, placeholder
}: InputTextProps) => {
    return (
        <input
            id={id}
            type="text"
            onChange={onChange}
            className={`${style} border border-gray-800 px-4 py-2 rounded-md text-gray-900`} placeholder={placeholder} />
    );
}

export const TextArea: React.FC<InputTextProps> = ({
    id, onChange, style, placeholder
}: InputTextProps) => {
    return (
        <textarea
            id={id}
            onChange={onChange}
            className={`${style} border border-gray-800 px-4 py-2 rounded-md text-gray-900`} placeholder={placeholder}>
            </textarea> 
    );
}