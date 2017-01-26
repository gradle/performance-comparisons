package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_83 {
    private final Production74_83 production = new Production74_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}