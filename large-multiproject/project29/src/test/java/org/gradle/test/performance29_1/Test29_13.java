package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_13 {
    private final Production29_13 production = new Production29_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}