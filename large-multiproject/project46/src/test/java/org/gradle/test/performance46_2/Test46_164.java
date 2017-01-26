package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_164 {
    private final Production46_164 production = new Production46_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}