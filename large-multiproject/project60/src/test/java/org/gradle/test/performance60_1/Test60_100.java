package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_100 {
    private final Production60_100 production = new Production60_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}