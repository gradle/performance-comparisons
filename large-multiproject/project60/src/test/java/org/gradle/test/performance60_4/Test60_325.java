package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_325 {
    private final Production60_325 production = new Production60_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}