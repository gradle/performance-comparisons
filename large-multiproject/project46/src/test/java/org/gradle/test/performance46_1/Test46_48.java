package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_48 {
    private final Production46_48 production = new Production46_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}