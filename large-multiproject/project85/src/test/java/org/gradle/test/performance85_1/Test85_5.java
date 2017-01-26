package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_5 {
    private final Production85_5 production = new Production85_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}