package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_238 {
    private final Production74_238 production = new Production74_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}