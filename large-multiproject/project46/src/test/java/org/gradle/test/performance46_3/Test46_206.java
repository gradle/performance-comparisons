package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_206 {
    private final Production46_206 production = new Production46_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}