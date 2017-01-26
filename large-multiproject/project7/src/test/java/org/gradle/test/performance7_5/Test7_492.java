package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_492 {
    private final Production7_492 production = new Production7_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}