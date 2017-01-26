package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_138 {
    private final Production60_138 production = new Production60_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}