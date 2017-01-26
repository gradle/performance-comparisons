package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_25 {
    private final Production60_25 production = new Production60_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}