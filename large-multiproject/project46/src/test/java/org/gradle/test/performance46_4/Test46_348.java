package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_348 {
    private final Production46_348 production = new Production46_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}