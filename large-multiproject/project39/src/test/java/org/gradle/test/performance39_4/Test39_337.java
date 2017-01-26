package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_337 {
    private final Production39_337 production = new Production39_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}