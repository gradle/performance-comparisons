package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_259 {
    private final Production18_259 production = new Production18_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}