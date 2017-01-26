package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_400 {
    private final Production29_400 production = new Production29_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}