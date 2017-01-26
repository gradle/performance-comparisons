package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_1 {
    private final Production74_1 production = new Production74_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}