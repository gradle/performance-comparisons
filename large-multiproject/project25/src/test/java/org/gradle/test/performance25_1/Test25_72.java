package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_72 {
    private final Production25_72 production = new Production25_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}