package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_213 {
    private final Production74_213 production = new Production74_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}