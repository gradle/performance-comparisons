package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_36 {
    private final Production60_36 production = new Production60_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}