package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_431 {
    private final Production74_431 production = new Production74_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}