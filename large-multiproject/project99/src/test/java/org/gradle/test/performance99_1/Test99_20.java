package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_20 {
    private final Production99_20 production = new Production99_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}