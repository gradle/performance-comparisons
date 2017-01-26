package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_398 {
    private final Production46_398 production = new Production46_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}