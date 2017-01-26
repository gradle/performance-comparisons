package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_222 {
    private final Production46_222 production = new Production46_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}