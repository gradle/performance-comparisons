package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_239 {
    private final Production46_239 production = new Production46_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}