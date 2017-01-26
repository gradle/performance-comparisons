package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_458 {
    private final Production39_458 production = new Production39_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}