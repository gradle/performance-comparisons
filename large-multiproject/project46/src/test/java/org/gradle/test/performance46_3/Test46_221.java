package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_221 {
    private final Production46_221 production = new Production46_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}