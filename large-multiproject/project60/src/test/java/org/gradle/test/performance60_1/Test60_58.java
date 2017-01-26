package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_58 {
    private final Production60_58 production = new Production60_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}