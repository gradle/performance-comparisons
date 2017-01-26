package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_107 {
    private final Production60_107 production = new Production60_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}