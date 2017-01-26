package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_47 {
    private final Production60_47 production = new Production60_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}