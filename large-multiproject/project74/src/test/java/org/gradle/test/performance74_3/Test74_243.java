package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_243 {
    private final Production74_243 production = new Production74_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}