package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_427 {
    private final Production49_427 production = new Production49_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}