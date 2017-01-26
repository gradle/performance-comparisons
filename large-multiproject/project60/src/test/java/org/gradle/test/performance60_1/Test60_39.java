package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_39 {
    private final Production60_39 production = new Production60_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}