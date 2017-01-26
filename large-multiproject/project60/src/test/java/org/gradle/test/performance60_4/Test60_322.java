package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_322 {
    private final Production60_322 production = new Production60_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}