package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_61 {
    private final Production24_61 production = new Production24_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}