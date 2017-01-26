package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_61 {
    private final Production39_61 production = new Production39_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}