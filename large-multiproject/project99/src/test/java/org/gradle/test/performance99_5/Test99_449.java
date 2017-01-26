package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_449 {
    private final Production99_449 production = new Production99_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}