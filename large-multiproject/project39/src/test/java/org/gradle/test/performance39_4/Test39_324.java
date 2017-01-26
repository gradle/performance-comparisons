package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_324 {
    private final Production39_324 production = new Production39_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}