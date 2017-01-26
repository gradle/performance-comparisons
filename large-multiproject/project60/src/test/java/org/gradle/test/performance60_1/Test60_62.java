package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_62 {
    private final Production60_62 production = new Production60_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}