package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_158 {
    private final Production7_158 production = new Production7_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}