package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_246 {
    private final Production60_246 production = new Production60_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}