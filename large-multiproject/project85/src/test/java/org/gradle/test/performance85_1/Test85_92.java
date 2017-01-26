package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_92 {
    private final Production85_92 production = new Production85_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}