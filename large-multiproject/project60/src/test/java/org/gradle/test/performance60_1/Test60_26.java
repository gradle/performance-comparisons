package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_26 {
    private final Production60_26 production = new Production60_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}