package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_360 {
    private final Production60_360 production = new Production60_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}