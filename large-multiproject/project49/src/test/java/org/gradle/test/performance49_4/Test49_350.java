package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_350 {
    private final Production49_350 production = new Production49_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}