package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_434 {
    private final Production60_434 production = new Production60_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}