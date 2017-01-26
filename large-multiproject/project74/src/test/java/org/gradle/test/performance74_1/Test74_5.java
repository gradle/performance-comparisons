package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_5 {
    private final Production74_5 production = new Production74_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}