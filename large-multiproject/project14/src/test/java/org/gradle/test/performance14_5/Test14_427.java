package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_427 {
    private final Production14_427 production = new Production14_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}