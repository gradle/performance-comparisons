package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_313 {
    private final Production60_313 production = new Production60_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}