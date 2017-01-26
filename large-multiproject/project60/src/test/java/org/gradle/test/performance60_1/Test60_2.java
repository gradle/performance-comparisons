package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_2 {
    private final Production60_2 production = new Production60_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}