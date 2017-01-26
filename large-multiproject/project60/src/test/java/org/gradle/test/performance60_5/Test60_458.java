package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_458 {
    private final Production60_458 production = new Production60_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}