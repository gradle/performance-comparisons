package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_449 {
    private final Production14_449 production = new Production14_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}