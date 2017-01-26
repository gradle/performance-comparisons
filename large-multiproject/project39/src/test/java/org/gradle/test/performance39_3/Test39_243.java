package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_243 {
    private final Production39_243 production = new Production39_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}