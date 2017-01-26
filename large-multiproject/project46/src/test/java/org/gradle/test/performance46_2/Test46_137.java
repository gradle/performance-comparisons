package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_137 {
    private final Production46_137 production = new Production46_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}