package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_68 {
    private final Production25_68 production = new Production25_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}