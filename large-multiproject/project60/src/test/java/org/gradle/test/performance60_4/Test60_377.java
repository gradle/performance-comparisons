package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_377 {
    private final Production60_377 production = new Production60_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}