package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_320 {
    private final Production85_320 production = new Production85_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}