package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_176 {
    private final Production7_176 production = new Production7_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}