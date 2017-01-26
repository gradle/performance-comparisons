package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_431 {
    private final Production29_431 production = new Production29_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}