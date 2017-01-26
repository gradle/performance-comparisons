package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_494 {
    private final Production64_494 production = new Production64_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}