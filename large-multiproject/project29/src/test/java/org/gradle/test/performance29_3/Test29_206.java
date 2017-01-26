package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_206 {
    private final Production29_206 production = new Production29_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}