package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_59 {
    private final Production74_59 production = new Production74_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}