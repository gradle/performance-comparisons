package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_468 {
    private final Production60_468 production = new Production60_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}