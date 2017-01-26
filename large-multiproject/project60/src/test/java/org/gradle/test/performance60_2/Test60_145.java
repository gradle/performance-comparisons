package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_145 {
    private final Production60_145 production = new Production60_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}