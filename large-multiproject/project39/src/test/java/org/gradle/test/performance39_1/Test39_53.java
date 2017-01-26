package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_53 {
    private final Production39_53 production = new Production39_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}