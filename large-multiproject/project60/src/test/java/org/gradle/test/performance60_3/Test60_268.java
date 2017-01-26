package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_268 {
    private final Production60_268 production = new Production60_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}