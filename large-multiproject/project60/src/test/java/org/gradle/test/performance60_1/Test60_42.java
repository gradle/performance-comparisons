package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_42 {
    private final Production60_42 production = new Production60_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}