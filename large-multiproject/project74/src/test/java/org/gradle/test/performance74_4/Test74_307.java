package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_307 {
    private final Production74_307 production = new Production74_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}