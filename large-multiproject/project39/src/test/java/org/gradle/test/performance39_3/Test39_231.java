package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_231 {
    private final Production39_231 production = new Production39_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}