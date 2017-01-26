package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_450 {
    private final Production85_450 production = new Production85_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}