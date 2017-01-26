package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_52 {
    private final Production74_52 production = new Production74_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}