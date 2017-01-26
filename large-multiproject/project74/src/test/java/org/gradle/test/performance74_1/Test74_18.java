package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_18 {
    private final Production74_18 production = new Production74_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}