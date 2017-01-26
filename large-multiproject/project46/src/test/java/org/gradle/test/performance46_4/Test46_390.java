package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_390 {
    private final Production46_390 production = new Production46_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}