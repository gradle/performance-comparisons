package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_382 {
    private final Production60_382 production = new Production60_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}