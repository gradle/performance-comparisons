package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_28 {
    private final Production39_28 production = new Production39_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}