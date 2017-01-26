package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_409 {
    private final Production46_409 production = new Production46_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}