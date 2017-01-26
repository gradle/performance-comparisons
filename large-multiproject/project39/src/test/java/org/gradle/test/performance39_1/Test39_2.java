package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_2 {
    private final Production39_2 production = new Production39_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}