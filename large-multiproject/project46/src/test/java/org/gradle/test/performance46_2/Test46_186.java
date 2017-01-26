package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_186 {
    private final Production46_186 production = new Production46_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}