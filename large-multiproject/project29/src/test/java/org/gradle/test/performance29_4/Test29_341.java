package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_341 {
    private final Production29_341 production = new Production29_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}