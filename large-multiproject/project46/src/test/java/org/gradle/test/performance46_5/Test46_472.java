package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_472 {
    private final Production46_472 production = new Production46_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}