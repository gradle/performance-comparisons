package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_59 {
    private final Production46_59 production = new Production46_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}