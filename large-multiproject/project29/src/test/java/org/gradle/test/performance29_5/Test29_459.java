package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_459 {
    private final Production29_459 production = new Production29_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}