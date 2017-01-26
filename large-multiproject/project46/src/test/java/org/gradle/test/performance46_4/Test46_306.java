package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_306 {
    private final Production46_306 production = new Production46_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}