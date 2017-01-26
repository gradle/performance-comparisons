package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_203 {
    private final Production39_203 production = new Production39_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}