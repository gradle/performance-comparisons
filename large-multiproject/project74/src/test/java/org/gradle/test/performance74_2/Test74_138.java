package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_138 {
    private final Production74_138 production = new Production74_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}