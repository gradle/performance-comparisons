package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_187 {
    private final Production74_187 production = new Production74_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}