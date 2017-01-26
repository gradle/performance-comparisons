package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_162 {
    private final Production39_162 production = new Production39_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}