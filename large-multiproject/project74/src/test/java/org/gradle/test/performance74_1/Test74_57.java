package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_57 {
    private final Production74_57 production = new Production74_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}