package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_427 {
    private final Production99_427 production = new Production99_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}