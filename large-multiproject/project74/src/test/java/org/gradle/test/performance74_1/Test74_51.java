package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_51 {
    private final Production74_51 production = new Production74_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}