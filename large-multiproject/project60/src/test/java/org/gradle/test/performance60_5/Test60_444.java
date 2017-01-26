package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_444 {
    private final Production60_444 production = new Production60_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}