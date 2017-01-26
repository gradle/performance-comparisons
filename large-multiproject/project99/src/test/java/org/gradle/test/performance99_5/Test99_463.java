package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_463 {
    private final Production99_463 production = new Production99_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}