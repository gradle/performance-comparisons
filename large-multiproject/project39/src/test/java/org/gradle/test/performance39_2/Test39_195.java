package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_195 {
    private final Production39_195 production = new Production39_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}