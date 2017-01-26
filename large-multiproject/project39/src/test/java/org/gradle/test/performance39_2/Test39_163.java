package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_163 {
    private final Production39_163 production = new Production39_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}