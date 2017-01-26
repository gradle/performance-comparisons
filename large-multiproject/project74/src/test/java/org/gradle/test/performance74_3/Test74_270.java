package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_270 {
    private final Production74_270 production = new Production74_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}