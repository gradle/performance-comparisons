package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_322 {
    private final Production85_322 production = new Production85_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}