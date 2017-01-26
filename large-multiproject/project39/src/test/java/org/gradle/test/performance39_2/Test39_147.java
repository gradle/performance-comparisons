package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_147 {
    private final Production39_147 production = new Production39_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}