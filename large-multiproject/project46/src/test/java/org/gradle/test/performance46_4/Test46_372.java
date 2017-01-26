package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_372 {
    private final Production46_372 production = new Production46_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}