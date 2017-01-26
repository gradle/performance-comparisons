package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_55 {
    private final Production74_55 production = new Production74_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}