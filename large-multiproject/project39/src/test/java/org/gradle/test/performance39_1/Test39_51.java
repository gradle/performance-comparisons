package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_51 {
    private final Production39_51 production = new Production39_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}