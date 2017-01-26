package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_350 {
    private final Production60_350 production = new Production60_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}