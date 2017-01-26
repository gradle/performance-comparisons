package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_390 {
    private final Production60_390 production = new Production60_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}