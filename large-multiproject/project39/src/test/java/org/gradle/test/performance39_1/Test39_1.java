package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_1 {
    private final Production39_1 production = new Production39_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}