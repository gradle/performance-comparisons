package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_253 {
    private final Production74_253 production = new Production74_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}