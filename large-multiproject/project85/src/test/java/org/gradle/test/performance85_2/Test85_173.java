package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_173 {
    private final Production85_173 production = new Production85_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}