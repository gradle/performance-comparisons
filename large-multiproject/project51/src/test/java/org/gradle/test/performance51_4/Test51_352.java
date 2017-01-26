package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_352 {
    private final Production51_352 production = new Production51_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}