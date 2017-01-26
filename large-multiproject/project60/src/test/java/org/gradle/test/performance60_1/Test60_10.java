package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_10 {
    private final Production60_10 production = new Production60_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}