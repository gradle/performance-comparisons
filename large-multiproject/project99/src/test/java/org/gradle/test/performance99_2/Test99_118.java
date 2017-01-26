package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_118 {
    private final Production99_118 production = new Production99_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}