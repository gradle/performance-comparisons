package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_96 {
    private final Production60_96 production = new Production60_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}