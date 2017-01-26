package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_435 {
    private final Production60_435 production = new Production60_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}