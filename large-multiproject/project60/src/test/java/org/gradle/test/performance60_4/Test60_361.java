package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_361 {
    private final Production60_361 production = new Production60_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}