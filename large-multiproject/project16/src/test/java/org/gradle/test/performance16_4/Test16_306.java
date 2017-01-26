package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_306 {
    private final Production16_306 production = new Production16_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}