package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_143 {
    private final Production46_143 production = new Production46_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}