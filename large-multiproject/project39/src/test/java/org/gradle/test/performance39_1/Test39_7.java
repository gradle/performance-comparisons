package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_7 {
    private final Production39_7 production = new Production39_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}