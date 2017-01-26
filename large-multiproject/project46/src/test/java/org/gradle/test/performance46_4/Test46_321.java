package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_321 {
    private final Production46_321 production = new Production46_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}