package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_427 {
    private final Production25_427 production = new Production25_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}