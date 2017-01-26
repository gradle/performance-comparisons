package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_427 {
    private final Production18_427 production = new Production18_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}