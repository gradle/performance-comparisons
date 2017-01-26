package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_270 {
    private final Production39_270 production = new Production39_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}