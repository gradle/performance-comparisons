package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_494 {
    private final Production52_494 production = new Production52_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}