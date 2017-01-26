package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_373 {
    private final Production39_373 production = new Production39_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}