package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_163 {
    private final Production85_163 production = new Production85_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}