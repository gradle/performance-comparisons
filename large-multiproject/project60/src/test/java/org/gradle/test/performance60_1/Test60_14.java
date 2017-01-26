package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_14 {
    private final Production60_14 production = new Production60_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}