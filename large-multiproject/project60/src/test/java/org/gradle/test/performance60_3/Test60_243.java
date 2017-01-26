package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_243 {
    private final Production60_243 production = new Production60_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}