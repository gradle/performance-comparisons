package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_65 {
    private final Production39_65 production = new Production39_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}