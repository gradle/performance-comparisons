package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_309 {
    private final Production85_309 production = new Production85_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}