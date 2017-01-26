package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_139 {
    private final Production39_139 production = new Production39_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}