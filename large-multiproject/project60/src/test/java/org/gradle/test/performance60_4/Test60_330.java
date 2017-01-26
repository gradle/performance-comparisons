package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_330 {
    private final Production60_330 production = new Production60_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}