package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_442 {
    private final Production60_442 production = new Production60_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}