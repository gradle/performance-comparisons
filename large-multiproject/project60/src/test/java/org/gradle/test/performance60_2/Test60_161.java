package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_161 {
    private final Production60_161 production = new Production60_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}