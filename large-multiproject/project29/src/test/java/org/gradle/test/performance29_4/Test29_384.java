package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_384 {
    private final Production29_384 production = new Production29_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}