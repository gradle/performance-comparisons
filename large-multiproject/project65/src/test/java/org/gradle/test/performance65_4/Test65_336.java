package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_336 {
    private final Production65_336 production = new Production65_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}