package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_156 {
    private final Production74_156 production = new Production74_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}