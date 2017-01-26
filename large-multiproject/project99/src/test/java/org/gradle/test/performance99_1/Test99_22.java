package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_22 {
    private final Production99_22 production = new Production99_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}