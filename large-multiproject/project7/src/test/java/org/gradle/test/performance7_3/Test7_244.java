package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_244 {
    private final Production7_244 production = new Production7_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}