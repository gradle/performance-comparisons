package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_242 {
    private final Production7_242 production = new Production7_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}