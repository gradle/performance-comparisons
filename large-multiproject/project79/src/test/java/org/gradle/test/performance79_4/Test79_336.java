package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_336 {
    private final Production79_336 production = new Production79_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}