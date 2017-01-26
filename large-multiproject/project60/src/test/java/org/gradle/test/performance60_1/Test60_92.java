package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_92 {
    private final Production60_92 production = new Production60_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}