package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_392 {
    private final Production74_392 production = new Production74_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}