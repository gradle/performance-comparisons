package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_156 {
    private final Production60_156 production = new Production60_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}