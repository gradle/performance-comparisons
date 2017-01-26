package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_29 {
    private final Production60_29 production = new Production60_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}