package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_464 {
    private final Production46_464 production = new Production46_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}