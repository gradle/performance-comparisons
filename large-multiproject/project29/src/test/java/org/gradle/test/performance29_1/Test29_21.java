package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_21 {
    private final Production29_21 production = new Production29_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}