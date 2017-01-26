package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_122 {
    private final Production74_122 production = new Production74_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}