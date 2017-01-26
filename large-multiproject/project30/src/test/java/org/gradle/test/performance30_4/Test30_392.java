package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_392 {
    private final Production30_392 production = new Production30_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}