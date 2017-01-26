package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_467 {
    private final Production99_467 production = new Production99_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}