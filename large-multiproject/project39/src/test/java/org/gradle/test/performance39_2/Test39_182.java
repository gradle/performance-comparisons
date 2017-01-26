package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_182 {
    private final Production39_182 production = new Production39_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}