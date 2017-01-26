package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_462 {
    private final Production85_462 production = new Production85_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}