package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_362 {
    private final Production46_362 production = new Production46_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}