package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_323 {
    private final Production60_323 production = new Production60_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}