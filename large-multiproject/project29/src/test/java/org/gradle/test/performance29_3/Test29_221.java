package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_221 {
    private final Production29_221 production = new Production29_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}