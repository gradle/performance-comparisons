package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_293 {
    private final Production60_293 production = new Production60_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}