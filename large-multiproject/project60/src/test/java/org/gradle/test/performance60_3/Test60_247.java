package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_247 {
    private final Production60_247 production = new Production60_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}