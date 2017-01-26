package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_427 {
    private final Production15_427 production = new Production15_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}