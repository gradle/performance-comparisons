package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_106 {
    private final Production39_106 production = new Production39_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}