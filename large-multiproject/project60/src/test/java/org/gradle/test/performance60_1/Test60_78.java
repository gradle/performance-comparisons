package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_78 {
    private final Production60_78 production = new Production60_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}