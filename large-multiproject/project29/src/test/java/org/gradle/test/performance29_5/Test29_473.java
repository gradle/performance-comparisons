package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_473 {
    private final Production29_473 production = new Production29_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}