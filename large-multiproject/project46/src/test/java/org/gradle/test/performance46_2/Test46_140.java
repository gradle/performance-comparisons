package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_140 {
    private final Production46_140 production = new Production46_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}