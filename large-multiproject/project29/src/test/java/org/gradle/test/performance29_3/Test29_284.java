package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_284 {
    private final Production29_284 production = new Production29_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}