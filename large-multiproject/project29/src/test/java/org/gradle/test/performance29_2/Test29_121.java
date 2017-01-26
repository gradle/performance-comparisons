package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_121 {
    private final Production29_121 production = new Production29_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}