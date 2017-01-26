package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_313 {
    private final Production85_313 production = new Production85_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}