package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_182 {
    private final Production60_182 production = new Production60_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}