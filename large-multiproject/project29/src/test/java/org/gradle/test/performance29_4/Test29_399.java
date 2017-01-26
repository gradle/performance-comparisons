package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_399 {
    private final Production29_399 production = new Production29_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}