package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_494 {
    private final Production11_494 production = new Production11_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}