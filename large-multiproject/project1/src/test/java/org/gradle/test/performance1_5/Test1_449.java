package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_449 {
    private final Production1_449 production = new Production1_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}