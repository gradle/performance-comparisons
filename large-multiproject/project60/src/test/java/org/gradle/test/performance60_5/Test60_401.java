package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_401 {
    private final Production60_401 production = new Production60_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}