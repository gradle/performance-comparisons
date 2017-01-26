package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_362 {
    private final Production85_362 production = new Production85_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}