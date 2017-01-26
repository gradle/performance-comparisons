package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_59 {
    private final Production60_59 production = new Production60_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}