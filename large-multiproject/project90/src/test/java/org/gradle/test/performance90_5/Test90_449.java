package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_449 {
    private final Production90_449 production = new Production90_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}