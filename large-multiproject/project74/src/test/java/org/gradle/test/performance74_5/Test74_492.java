package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_492 {
    private final Production74_492 production = new Production74_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}