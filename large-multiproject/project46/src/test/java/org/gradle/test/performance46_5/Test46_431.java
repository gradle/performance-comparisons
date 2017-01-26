package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_431 {
    private final Production46_431 production = new Production46_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}