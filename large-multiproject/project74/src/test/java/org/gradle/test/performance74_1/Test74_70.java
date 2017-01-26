package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_70 {
    private final Production74_70 production = new Production74_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}