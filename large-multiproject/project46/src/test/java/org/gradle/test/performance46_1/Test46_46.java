package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_46 {
    private final Production46_46 production = new Production46_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}