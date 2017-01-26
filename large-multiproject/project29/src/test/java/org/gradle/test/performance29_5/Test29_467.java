package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_467 {
    private final Production29_467 production = new Production29_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}