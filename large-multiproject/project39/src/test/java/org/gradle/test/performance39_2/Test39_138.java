package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_138 {
    private final Production39_138 production = new Production39_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}