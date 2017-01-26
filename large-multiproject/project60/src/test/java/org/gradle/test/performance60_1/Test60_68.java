package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_68 {
    private final Production60_68 production = new Production60_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}