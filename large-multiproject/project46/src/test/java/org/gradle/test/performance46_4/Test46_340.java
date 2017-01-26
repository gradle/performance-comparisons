package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_340 {
    private final Production46_340 production = new Production46_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}