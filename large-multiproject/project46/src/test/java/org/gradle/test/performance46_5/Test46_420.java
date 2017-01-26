package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_420 {
    private final Production46_420 production = new Production46_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}