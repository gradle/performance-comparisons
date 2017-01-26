package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_304 {
    private final Production85_304 production = new Production85_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}