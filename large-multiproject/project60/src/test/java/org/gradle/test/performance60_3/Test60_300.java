package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_300 {
    private final Production60_300 production = new Production60_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}