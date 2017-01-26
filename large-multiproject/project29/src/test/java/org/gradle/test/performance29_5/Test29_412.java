package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_412 {
    private final Production29_412 production = new Production29_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}