package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_16 {
    private final Production46_16 production = new Production46_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}