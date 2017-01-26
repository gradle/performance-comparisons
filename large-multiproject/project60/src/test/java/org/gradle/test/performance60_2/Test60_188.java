package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_188 {
    private final Production60_188 production = new Production60_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}