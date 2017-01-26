package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_379 {
    private final Production46_379 production = new Production46_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}