package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_235 {
    private final Production74_235 production = new Production74_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}