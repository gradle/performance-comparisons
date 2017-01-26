package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_214 {
    private final Production60_214 production = new Production60_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}