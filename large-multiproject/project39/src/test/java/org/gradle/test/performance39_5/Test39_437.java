package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_437 {
    private final Production39_437 production = new Production39_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}