package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_358 {
    private final Production39_358 production = new Production39_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}