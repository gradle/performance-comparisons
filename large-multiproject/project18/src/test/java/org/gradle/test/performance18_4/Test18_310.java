package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_310 {
    private final Production18_310 production = new Production18_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}