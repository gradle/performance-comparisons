package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_488 {
    private final Production60_488 production = new Production60_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}