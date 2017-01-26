package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_5 {
    private final Production39_5 production = new Production39_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}