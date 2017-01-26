package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_200 {
    private final Production39_200 production = new Production39_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}