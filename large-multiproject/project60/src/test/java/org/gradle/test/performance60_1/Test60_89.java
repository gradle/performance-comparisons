package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_89 {
    private final Production60_89 production = new Production60_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}