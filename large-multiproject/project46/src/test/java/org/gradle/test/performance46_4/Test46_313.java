package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_313 {
    private final Production46_313 production = new Production46_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}