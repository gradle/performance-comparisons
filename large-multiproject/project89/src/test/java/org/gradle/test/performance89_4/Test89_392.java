package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_392 {
    private final Production89_392 production = new Production89_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}