package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_285 {
    private final Production46_285 production = new Production46_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}