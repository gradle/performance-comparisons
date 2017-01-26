package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_104 {
    private final Production85_104 production = new Production85_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}