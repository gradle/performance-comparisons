package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_131 {
    private final Production74_131 production = new Production74_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}