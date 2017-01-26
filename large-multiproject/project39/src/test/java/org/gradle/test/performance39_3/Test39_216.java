package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_216 {
    private final Production39_216 production = new Production39_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}