package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_3 {
    private final Production60_3 production = new Production60_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}