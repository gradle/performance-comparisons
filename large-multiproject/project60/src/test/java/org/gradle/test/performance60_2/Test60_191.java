package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_191 {
    private final Production60_191 production = new Production60_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}