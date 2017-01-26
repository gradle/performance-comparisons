package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_251 {
    private final Production60_251 production = new Production60_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}