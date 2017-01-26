package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_63 {
    private final Production46_63 production = new Production46_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}