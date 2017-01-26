package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_214 {
    private final Production85_214 production = new Production85_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}