package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_415 {
    private final Production39_415 production = new Production39_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}