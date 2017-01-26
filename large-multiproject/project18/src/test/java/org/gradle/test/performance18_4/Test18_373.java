package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_373 {
    private final Production18_373 production = new Production18_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}