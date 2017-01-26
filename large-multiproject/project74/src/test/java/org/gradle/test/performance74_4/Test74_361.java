package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_361 {
    private final Production74_361 production = new Production74_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}