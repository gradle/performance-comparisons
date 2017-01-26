package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_196 {
    private final Production60_196 production = new Production60_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}