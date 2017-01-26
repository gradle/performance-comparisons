package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_479 {
    private final Production60_479 production = new Production60_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}