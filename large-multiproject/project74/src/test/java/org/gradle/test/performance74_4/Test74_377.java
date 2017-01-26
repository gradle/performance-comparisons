package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_377 {
    private final Production74_377 production = new Production74_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}