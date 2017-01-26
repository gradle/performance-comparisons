package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_415 {
    private final Production60_415 production = new Production60_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}