package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_395 {
    private final Production60_395 production = new Production60_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}