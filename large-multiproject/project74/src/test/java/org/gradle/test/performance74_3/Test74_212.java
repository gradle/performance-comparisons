package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_212 {
    private final Production74_212 production = new Production74_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}