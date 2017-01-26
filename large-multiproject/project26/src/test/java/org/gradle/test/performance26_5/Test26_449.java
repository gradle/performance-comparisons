package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_449 {
    private final Production26_449 production = new Production26_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}