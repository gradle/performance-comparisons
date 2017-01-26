package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_281 {
    private final Production39_281 production = new Production39_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}