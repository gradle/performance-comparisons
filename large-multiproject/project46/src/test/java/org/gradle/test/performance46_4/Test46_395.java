package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_395 {
    private final Production46_395 production = new Production46_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}