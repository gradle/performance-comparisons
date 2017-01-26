package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_290 {
    private final Production74_290 production = new Production74_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}