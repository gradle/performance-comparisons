package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_19 {
    private final Production7_19 production = new Production7_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}