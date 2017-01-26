package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_1 {
    private final Production60_1 production = new Production60_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}