package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_449 {
    private final Production55_449 production = new Production55_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}