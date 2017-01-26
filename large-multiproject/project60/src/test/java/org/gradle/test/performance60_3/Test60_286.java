package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_286 {
    private final Production60_286 production = new Production60_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}