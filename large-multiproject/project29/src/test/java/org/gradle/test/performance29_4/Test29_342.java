package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_342 {
    private final Production29_342 production = new Production29_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}