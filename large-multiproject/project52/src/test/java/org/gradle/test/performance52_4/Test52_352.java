package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_352 {
    private final Production52_352 production = new Production52_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}