package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_92 {
    private final Production74_92 production = new Production74_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}