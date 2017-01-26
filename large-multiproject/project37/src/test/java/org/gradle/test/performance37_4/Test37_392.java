package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_392 {
    private final Production37_392 production = new Production37_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}