package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_367 {
    private final Production49_367 production = new Production49_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}