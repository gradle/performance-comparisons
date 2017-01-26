package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_467 {
    private final Production46_467 production = new Production46_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}