package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_4 {
    private final Production46_4 production = new Production46_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}