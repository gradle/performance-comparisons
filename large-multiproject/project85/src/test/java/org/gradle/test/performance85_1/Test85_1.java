package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_1 {
    private final Production85_1 production = new Production85_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}