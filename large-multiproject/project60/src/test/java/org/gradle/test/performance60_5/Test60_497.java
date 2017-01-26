package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_497 {
    private final Production60_497 production = new Production60_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}