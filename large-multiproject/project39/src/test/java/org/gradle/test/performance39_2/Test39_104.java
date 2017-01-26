package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_104 {
    private final Production39_104 production = new Production39_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}