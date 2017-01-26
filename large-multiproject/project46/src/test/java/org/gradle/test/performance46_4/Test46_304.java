package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_304 {
    private final Production46_304 production = new Production46_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}