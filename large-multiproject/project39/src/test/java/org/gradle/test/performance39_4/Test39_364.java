package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_364 {
    private final Production39_364 production = new Production39_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}