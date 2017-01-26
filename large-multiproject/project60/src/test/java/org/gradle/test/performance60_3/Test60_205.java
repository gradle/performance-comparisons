package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_205 {
    private final Production60_205 production = new Production60_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}