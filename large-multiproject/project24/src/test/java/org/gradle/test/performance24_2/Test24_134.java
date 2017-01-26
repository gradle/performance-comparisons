package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_134 {
    private final Production24_134 production = new Production24_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}