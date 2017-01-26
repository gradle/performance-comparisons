package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_47 {
    private final Production39_47 production = new Production39_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}