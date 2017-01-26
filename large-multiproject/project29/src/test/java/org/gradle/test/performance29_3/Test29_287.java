package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_287 {
    private final Production29_287 production = new Production29_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}