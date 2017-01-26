package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_317 {
    private final Production46_317 production = new Production46_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}