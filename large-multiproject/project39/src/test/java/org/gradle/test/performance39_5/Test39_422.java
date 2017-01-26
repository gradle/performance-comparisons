package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_422 {
    private final Production39_422 production = new Production39_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}