package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_162 {
    private final Production60_162 production = new Production60_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}