package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_305 {
    private final Production60_305 production = new Production60_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}