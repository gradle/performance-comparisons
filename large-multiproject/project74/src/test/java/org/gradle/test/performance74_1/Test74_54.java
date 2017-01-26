package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_54 {
    private final Production74_54 production = new Production74_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}