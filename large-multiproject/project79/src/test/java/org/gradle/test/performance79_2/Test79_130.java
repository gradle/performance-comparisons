package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_130 {
    private final Production79_130 production = new Production79_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}