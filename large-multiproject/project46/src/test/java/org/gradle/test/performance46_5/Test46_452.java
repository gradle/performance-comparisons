package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_452 {
    private final Production46_452 production = new Production46_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}