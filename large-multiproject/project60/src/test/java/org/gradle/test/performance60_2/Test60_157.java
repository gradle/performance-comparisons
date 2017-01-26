package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_157 {
    private final Production60_157 production = new Production60_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}