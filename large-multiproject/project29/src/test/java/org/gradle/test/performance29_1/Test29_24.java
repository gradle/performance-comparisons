package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_24 {
    private final Production29_24 production = new Production29_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}