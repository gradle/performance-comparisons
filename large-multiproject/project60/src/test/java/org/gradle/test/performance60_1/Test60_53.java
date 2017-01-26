package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_53 {
    private final Production60_53 production = new Production60_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}