package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_109 {
    private final Production39_109 production = new Production39_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}