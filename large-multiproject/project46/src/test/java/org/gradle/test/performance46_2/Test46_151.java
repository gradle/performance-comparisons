package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_151 {
    private final Production46_151 production = new Production46_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}