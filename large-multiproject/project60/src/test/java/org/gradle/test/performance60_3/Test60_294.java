package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_294 {
    private final Production60_294 production = new Production60_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}