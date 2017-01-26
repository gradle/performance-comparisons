package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_306 {
    private final Production86_306 production = new Production86_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}