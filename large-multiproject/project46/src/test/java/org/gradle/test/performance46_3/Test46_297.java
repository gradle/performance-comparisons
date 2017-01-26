package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_297 {
    private final Production46_297 production = new Production46_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}