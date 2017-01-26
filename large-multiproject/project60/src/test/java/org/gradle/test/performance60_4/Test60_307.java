package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_307 {
    private final Production60_307 production = new Production60_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}