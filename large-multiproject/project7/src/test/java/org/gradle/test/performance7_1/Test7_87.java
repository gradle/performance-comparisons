package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_87 {
    private final Production7_87 production = new Production7_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}