package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_83 {
    private final Production46_83 production = new Production46_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}