package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_427 {
    private final Production30_427 production = new Production30_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}