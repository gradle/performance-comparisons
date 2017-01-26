package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_200 {
    private final Production60_200 production = new Production60_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}