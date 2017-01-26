package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_392 {
    private final Production5_392 production = new Production5_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}