package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_336 {
    private final Production68_336 production = new Production68_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}