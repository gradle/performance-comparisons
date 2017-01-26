package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_293 {
    private final Production39_293 production = new Production39_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}