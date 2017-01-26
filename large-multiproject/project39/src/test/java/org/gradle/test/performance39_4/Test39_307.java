package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_307 {
    private final Production39_307 production = new Production39_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}