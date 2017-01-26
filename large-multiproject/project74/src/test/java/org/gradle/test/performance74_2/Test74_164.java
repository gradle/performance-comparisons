package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_164 {
    private final Production74_164 production = new Production74_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}