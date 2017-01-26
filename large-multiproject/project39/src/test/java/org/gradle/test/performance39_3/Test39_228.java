package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_228 {
    private final Production39_228 production = new Production39_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}