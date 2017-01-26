package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_59 {
    private final Production39_59 production = new Production39_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}