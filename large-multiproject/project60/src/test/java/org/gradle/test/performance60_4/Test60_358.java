package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_358 {
    private final Production60_358 production = new Production60_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}