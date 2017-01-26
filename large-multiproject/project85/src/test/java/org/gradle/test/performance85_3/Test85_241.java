package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_241 {
    private final Production85_241 production = new Production85_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}