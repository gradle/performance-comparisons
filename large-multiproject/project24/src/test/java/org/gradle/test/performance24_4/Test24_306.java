package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_306 {
    private final Production24_306 production = new Production24_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}