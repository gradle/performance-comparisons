package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_310 {
    private final Production60_310 production = new Production60_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}