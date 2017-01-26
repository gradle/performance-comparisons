package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_8 {
    private final Production60_8 production = new Production60_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}