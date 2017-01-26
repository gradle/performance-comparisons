package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_165 {
    private final Production74_165 production = new Production74_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}