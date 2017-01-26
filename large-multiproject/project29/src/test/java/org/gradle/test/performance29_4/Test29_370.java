package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_370 {
    private final Production29_370 production = new Production29_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}