package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_212 {
    private final Production60_212 production = new Production60_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}