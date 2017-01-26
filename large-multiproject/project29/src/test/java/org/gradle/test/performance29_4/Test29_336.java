package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_336 {
    private final Production29_336 production = new Production29_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}