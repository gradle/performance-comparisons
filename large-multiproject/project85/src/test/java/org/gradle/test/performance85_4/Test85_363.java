package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_363 {
    private final Production85_363 production = new Production85_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}