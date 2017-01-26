package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_306 {
    private final Production5_306 production = new Production5_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}