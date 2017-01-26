package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_33 {
    private final Production74_33 production = new Production74_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}