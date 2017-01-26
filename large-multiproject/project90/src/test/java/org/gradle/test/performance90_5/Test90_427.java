package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_427 {
    private final Production90_427 production = new Production90_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}