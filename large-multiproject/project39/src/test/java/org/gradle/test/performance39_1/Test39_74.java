package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_74 {
    private final Production39_74 production = new Production39_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}