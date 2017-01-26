package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_87 {
    private final Production85_87 production = new Production85_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}