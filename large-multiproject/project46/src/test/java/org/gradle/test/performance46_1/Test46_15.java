package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_15 {
    private final Production46_15 production = new Production46_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}