package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_140 {
    private final Production74_140 production = new Production74_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}