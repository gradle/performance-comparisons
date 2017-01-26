package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_301 {
    private final Production46_301 production = new Production46_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}