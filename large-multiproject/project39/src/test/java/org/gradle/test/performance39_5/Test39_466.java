package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_466 {
    private final Production39_466 production = new Production39_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}