package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_283 {
    private final Production46_283 production = new Production46_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}