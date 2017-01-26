package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_434 {
    private final Production46_434 production = new Production46_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}