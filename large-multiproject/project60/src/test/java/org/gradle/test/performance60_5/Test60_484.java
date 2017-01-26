package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_484 {
    private final Production60_484 production = new Production60_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}