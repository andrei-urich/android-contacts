package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface <T> {
 public <T> boolean theSameAs (@NonNull  T item);

 public boolean equals(Object o);


}
