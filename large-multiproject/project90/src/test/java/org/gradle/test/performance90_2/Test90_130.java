package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_130 {
    private final Production90_130 production = new Production90_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}