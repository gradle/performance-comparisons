package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_392 {
    private final Production92_392 production = new Production92_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}