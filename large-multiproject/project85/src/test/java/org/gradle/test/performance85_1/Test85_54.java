package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_54 {
    private final Production85_54 production = new Production85_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}