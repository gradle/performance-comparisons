package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_26 {
    private final Production39_26 production = new Production39_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}