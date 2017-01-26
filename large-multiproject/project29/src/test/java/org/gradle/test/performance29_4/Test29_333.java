package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_333 {
    private final Production29_333 production = new Production29_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}