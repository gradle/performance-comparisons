package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_175 {
    private final Production46_175 production = new Production46_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}