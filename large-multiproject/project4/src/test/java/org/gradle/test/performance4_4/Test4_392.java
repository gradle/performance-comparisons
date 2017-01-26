package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_392 {
    private final Production4_392 production = new Production4_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}