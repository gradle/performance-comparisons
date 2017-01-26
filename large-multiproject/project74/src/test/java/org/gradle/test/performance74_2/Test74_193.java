package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_193 {
    private final Production74_193 production = new Production74_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}