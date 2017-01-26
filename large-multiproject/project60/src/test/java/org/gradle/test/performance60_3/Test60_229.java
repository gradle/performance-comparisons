package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_229 {
    private final Production60_229 production = new Production60_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}