package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_266 {
    private final Production74_266 production = new Production74_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}