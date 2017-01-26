package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_18 {
    private final Production46_18 production = new Production46_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}