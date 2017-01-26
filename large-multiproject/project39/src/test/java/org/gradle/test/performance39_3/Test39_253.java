package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_253 {
    private final Production39_253 production = new Production39_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}