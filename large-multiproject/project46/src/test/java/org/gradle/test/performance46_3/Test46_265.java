package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_265 {
    private final Production46_265 production = new Production46_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}