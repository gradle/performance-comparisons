package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_492 {
    private final Production60_492 production = new Production60_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}