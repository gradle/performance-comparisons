package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_494 {
    private final Production34_494 production = new Production34_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}