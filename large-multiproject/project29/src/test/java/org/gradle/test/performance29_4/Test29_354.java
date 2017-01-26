package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_354 {
    private final Production29_354 production = new Production29_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}