package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_210 {
    private final Production60_210 production = new Production60_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}