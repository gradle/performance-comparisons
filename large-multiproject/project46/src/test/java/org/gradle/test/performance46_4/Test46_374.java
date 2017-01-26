package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_374 {
    private final Production46_374 production = new Production46_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}