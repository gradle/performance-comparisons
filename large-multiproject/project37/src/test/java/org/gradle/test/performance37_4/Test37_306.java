package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_306 {
    private final Production37_306 production = new Production37_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}