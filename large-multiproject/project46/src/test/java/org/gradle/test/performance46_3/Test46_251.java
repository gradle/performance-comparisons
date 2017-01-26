package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_251 {
    private final Production46_251 production = new Production46_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}