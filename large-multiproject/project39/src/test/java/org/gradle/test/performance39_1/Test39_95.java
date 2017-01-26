package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_95 {
    private final Production39_95 production = new Production39_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}