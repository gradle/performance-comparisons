package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_306 {
    private final Production15_306 production = new Production15_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}