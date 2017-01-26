package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_392 {
    private final Production60_392 production = new Production60_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}