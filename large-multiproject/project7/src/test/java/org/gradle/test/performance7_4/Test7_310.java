package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_310 {
    private final Production7_310 production = new Production7_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}