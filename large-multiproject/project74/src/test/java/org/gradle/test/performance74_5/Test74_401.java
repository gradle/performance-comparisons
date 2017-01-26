package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_401 {
    private final Production74_401 production = new Production74_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}