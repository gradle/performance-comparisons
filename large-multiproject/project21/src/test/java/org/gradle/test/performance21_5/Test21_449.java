package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_449 {
    private final Production21_449 production = new Production21_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}