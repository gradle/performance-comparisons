package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_402 {
    private final Production99_402 production = new Production99_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}