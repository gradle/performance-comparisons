package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_445 {
    private final Production25_445 production = new Production25_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}