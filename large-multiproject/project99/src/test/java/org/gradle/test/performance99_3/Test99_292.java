package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_292 {
    private final Production99_292 production = new Production99_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}