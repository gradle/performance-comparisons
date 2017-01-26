package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_281 {
    private final Production60_281 production = new Production60_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}