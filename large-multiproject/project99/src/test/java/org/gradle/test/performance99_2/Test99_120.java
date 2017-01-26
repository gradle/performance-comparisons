package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_120 {
    private final Production99_120 production = new Production99_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}