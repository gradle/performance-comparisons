package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_60 {
    private final Production74_60 production = new Production74_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}