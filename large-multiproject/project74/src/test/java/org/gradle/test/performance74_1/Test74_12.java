package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_12 {
    private final Production74_12 production = new Production74_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}