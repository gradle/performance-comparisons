package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_90 {
    private final Production60_90 production = new Production60_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}