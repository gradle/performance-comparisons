package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_4 {
    private final Production39_4 production = new Production39_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}