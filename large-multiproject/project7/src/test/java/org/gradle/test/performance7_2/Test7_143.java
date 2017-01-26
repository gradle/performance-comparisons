package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_143 {
    private final Production7_143 production = new Production7_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}