package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_356 {
    private final Production60_356 production = new Production60_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}