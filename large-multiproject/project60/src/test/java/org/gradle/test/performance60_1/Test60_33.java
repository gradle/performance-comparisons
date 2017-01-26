package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_33 {
    private final Production60_33 production = new Production60_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}