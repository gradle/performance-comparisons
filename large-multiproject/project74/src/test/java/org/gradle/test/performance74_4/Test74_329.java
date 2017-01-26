package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_329 {
    private final Production74_329 production = new Production74_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}