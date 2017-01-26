package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_114 {
    private final Production39_114 production = new Production39_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}