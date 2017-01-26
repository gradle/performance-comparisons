package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_35 {
    private final Production60_35 production = new Production60_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}