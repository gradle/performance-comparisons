package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_112 {
    private final Production74_112 production = new Production74_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}