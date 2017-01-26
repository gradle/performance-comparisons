package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_259 {
    private final Production74_259 production = new Production74_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}