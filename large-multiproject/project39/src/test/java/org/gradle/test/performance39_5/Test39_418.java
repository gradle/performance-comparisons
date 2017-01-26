package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_418 {
    private final Production39_418 production = new Production39_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}