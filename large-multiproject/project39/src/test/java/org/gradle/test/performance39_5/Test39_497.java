package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_497 {
    private final Production39_497 production = new Production39_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}