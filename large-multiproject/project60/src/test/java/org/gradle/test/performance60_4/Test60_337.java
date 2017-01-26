package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_337 {
    private final Production60_337 production = new Production60_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}