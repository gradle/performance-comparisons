package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_432 {
    private final Production39_432 production = new Production39_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}