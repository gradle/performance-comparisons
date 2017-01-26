package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_350 {
    private final Production39_350 production = new Production39_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}