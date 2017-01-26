package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_99 {
    private final Production39_99 production = new Production39_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}