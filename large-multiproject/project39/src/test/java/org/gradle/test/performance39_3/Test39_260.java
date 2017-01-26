package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_260 {
    private final Production39_260 production = new Production39_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}