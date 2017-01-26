package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_318 {
    private final Production29_318 production = new Production29_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}