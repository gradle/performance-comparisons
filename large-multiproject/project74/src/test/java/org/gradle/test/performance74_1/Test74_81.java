package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_81 {
    private final Production74_81 production = new Production74_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}