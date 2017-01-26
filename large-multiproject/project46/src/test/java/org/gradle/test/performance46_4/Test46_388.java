package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_388 {
    private final Production46_388 production = new Production46_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}