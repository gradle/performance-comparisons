package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_362 {
    private final Production74_362 production = new Production74_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}