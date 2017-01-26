package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_214 {
    private final Production39_214 production = new Production39_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}