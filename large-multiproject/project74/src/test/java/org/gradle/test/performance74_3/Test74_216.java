package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_216 {
    private final Production74_216 production = new Production74_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}