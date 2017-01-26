package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_220 {
    private final Production74_220 production = new Production74_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}