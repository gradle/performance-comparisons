package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_106 {
    private final Production60_106 production = new Production60_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}