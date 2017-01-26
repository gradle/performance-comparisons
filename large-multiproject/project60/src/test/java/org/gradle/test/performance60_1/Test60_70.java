package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_70 {
    private final Production60_70 production = new Production60_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}