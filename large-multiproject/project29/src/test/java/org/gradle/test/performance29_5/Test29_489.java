package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_489 {
    private final Production29_489 production = new Production29_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}