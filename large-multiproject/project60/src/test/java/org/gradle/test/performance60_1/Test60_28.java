package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_28 {
    private final Production60_28 production = new Production60_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}