package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_427 {
    private final Production58_427 production = new Production58_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}