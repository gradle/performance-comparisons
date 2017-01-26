package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_186 {
    private final Production60_186 production = new Production60_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}