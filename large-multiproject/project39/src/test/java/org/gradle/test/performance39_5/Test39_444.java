package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_444 {
    private final Production39_444 production = new Production39_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}