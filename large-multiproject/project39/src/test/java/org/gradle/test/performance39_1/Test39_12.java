package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_12 {
    private final Production39_12 production = new Production39_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}