package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_365 {
    private final Production60_365 production = new Production60_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}