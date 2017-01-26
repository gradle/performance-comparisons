package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_147 {
    private final Production60_147 production = new Production60_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}