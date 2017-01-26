package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_139 {
    private final Production46_139 production = new Production46_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}