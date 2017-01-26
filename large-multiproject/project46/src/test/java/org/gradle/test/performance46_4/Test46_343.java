package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_343 {
    private final Production46_343 production = new Production46_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}