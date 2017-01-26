package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_106 {
    private final Production74_106 production = new Production74_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}