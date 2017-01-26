package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_106 {
    private final Production18_106 production = new Production18_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}