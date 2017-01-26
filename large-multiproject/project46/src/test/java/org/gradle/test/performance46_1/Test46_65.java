package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_65 {
    private final Production46_65 production = new Production46_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}