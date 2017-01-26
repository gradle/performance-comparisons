package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_104 {
    private final Production60_104 production = new Production60_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}