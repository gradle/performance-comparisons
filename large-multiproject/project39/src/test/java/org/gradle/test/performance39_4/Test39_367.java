package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_367 {
    private final Production39_367 production = new Production39_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}