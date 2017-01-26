package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_31 {
    private final Production60_31 production = new Production60_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}