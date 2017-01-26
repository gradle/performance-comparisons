package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_103 {
    private final Production46_103 production = new Production46_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}