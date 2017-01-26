package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_310 {
    private final Production39_310 production = new Production39_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}