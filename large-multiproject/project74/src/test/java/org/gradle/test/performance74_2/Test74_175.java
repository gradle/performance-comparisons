package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_175 {
    private final Production74_175 production = new Production74_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}