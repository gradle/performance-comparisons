package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_58 {
    private final Production25_58 production = new Production25_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}