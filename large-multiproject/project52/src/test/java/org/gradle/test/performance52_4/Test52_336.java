package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_336 {
    private final Production52_336 production = new Production52_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}