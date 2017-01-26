package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_47 {
    private final Production74_47 production = new Production74_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}