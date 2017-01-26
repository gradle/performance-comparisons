package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_392 {
    private final Production46_392 production = new Production46_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}