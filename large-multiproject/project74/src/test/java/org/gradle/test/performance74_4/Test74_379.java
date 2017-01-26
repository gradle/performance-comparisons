package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_379 {
    private final Production74_379 production = new Production74_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}