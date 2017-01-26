package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_306 {
    private final Production20_306 production = new Production20_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}