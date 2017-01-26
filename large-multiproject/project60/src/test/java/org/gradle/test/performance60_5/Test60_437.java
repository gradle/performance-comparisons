package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_437 {
    private final Production60_437 production = new Production60_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}