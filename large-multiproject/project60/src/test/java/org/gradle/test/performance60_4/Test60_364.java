package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_364 {
    private final Production60_364 production = new Production60_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}