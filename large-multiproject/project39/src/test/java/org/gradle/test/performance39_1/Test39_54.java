package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_54 {
    private final Production39_54 production = new Production39_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}