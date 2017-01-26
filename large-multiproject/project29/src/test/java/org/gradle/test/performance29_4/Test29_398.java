package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_398 {
    private final Production29_398 production = new Production29_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}