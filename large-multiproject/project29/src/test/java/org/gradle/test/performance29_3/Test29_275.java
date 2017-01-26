package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_275 {
    private final Production29_275 production = new Production29_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}