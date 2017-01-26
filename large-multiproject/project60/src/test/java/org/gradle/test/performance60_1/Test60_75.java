package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_75 {
    private final Production60_75 production = new Production60_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}