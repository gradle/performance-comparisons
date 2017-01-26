package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_37 {
    private final Production74_37 production = new Production74_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}