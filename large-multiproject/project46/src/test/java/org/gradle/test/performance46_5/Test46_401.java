package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_401 {
    private final Production46_401 production = new Production46_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}