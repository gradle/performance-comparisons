package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_205 {
    private final Production7_205 production = new Production7_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}