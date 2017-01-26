package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_352 {
    private final Production23_352 production = new Production23_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}