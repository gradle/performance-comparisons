package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_350 {
    private final Production85_350 production = new Production85_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}