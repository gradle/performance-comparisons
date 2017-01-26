package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_67 {
    private final Production60_67 production = new Production60_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}