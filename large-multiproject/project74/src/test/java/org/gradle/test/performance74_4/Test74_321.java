package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_321 {
    private final Production74_321 production = new Production74_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}