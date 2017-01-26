package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_12 {
    private final Production46_12 production = new Production46_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}