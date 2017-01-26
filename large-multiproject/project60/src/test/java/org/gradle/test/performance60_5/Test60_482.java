package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_482 {
    private final Production60_482 production = new Production60_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}