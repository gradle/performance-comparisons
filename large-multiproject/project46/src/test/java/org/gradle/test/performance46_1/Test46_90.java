package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_90 {
    private final Production46_90 production = new Production46_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}