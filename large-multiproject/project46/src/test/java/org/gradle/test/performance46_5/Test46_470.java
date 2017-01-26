package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_470 {
    private final Production46_470 production = new Production46_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}