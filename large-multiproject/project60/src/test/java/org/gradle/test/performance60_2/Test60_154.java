package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_154 {
    private final Production60_154 production = new Production60_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}