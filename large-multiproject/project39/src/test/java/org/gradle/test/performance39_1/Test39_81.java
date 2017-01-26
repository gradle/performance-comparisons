package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_81 {
    private final Production39_81 production = new Production39_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}