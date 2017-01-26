package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_306 {
    private final Production39_306 production = new Production39_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}