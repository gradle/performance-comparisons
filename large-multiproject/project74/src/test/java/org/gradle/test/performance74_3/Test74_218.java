package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_218 {
    private final Production74_218 production = new Production74_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}