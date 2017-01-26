package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_7 {
    private final Production74_7 production = new Production74_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}