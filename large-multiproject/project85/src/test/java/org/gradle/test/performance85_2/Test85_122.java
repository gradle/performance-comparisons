package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_122 {
    private final Production85_122 production = new Production85_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}