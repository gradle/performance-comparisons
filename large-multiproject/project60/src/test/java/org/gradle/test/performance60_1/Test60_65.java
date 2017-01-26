package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_65 {
    private final Production60_65 production = new Production60_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}