package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_343 {
    private final Production74_343 production = new Production74_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}