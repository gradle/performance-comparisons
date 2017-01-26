package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_222 {
    private final Production60_222 production = new Production60_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}