package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_220 {
    private final Production39_220 production = new Production39_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}