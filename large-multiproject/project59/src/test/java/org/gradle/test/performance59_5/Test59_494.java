package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_494 {
    private final Production59_494 production = new Production59_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}