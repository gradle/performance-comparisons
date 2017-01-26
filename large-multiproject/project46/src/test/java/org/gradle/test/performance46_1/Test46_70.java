package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_70 {
    private final Production46_70 production = new Production46_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}