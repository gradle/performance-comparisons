package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_173 {
    private final Production74_173 production = new Production74_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}