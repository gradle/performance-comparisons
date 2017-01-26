package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_360 {
    private final Production46_360 production = new Production46_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}