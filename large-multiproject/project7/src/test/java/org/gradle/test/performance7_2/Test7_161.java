package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_161 {
    private final Production7_161 production = new Production7_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}