package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_137 {
    private final Production60_137 production = new Production60_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}