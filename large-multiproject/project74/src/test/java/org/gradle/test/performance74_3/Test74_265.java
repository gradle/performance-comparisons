package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_265 {
    private final Production74_265 production = new Production74_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}