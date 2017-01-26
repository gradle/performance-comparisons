package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_248 {
    private final Production29_248 production = new Production29_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}