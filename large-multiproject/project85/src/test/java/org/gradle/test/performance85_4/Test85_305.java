package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_305 {
    private final Production85_305 production = new Production85_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}