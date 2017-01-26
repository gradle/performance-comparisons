package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_202 {
    private final Production60_202 production = new Production60_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}