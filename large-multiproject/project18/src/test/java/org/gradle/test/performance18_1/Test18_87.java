package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_87 {
    private final Production18_87 production = new Production18_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}