package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_324 {
    private final Production15_324 production = new Production15_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}