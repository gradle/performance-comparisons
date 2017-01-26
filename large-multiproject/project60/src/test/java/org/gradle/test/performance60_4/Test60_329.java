package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_329 {
    private final Production60_329 production = new Production60_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}