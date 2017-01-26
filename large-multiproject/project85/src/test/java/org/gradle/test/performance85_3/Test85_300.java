package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_300 {
    private final Production85_300 production = new Production85_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}