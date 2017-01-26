package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_324 {
    private final Production46_324 production = new Production46_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}