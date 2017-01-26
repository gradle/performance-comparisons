package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_63 {
    private final Production85_63 production = new Production85_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}