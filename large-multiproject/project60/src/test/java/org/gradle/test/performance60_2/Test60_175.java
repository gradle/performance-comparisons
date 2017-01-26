package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_175 {
    private final Production60_175 production = new Production60_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}