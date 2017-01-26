package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_422 {
    private final Production60_422 production = new Production60_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}