package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_163 {
    private final Production74_163 production = new Production74_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}