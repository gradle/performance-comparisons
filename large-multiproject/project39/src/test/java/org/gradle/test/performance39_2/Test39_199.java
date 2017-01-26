package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_199 {
    private final Production39_199 production = new Production39_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}