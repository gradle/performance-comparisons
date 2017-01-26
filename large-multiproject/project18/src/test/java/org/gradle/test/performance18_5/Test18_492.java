package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_492 {
    private final Production18_492 production = new Production18_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}