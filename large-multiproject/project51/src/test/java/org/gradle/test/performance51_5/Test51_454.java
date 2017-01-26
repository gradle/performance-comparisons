package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_454 {
    private final Production51_454 production = new Production51_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}