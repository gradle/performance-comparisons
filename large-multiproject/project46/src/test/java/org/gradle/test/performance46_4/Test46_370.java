package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_370 {
    private final Production46_370 production = new Production46_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}