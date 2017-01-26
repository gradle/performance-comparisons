package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_362 {
    private final Production60_362 production = new Production60_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}