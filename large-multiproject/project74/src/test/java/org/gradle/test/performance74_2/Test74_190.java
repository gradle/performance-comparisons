package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_190 {
    private final Production74_190 production = new Production74_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}