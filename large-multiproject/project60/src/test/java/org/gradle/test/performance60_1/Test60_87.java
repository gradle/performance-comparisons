package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_87 {
    private final Production60_87 production = new Production60_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}