package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_449 {
    private final Production63_449 production = new Production63_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}