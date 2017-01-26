package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_238 {
    private final Production46_238 production = new Production46_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}