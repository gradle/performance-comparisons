package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_427 {
    private final Production7_427 production = new Production7_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}