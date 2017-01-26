package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_450 {
    private final Production46_450 production = new Production46_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}