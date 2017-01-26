package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_306 {
    private final Production27_306 production = new Production27_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}