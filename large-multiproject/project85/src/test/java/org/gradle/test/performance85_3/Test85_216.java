package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_216 {
    private final Production85_216 production = new Production85_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}