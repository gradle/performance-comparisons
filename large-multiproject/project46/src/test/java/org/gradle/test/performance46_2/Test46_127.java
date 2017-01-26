package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_127 {
    private final Production46_127 production = new Production46_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}