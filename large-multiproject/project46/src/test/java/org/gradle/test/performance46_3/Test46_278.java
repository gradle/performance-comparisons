package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_278 {
    private final Production46_278 production = new Production46_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}