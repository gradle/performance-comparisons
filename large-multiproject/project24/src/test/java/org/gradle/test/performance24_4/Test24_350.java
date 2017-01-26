package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_350 {
    private final Production24_350 production = new Production24_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}