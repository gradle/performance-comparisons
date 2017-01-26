package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_324 {
    private final Production60_324 production = new Production60_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}