package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_95 {
    private final Production74_95 production = new Production74_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}