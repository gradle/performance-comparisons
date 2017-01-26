package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_238 {
    private final Production39_238 production = new Production39_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}