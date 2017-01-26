package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_232 {
    private final Production29_232 production = new Production29_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}