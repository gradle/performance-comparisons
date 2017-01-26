package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_389 {
    private final Production46_389 production = new Production46_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}