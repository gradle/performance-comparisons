package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_465 {
    private final Production39_465 production = new Production39_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}