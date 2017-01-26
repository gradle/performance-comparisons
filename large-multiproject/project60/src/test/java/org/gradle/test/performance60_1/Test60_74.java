package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_74 {
    private final Production60_74 production = new Production60_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}