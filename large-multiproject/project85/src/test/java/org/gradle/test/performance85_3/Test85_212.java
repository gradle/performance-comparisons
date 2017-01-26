package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_212 {
    private final Production85_212 production = new Production85_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}