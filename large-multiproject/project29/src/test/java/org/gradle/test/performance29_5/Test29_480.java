package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_480 {
    private final Production29_480 production = new Production29_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}