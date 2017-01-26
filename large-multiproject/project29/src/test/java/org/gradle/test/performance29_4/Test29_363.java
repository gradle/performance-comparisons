package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_363 {
    private final Production29_363 production = new Production29_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}