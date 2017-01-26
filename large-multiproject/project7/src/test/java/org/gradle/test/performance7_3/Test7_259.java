package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_259 {
    private final Production7_259 production = new Production7_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}