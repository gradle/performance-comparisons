package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_135 {
    private final Production60_135 production = new Production60_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}