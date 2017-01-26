package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_174 {
    private final Production46_174 production = new Production46_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}