package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_424 {
    private final Production46_424 production = new Production46_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}