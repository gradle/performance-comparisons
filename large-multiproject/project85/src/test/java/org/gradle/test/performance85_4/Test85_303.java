package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_303 {
    private final Production85_303 production = new Production85_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}