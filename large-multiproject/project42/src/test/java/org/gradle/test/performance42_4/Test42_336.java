package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_336 {
    private final Production42_336 production = new Production42_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}