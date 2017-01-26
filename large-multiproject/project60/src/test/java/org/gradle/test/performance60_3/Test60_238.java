package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_238 {
    private final Production60_238 production = new Production60_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}