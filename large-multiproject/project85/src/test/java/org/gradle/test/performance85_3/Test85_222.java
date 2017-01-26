package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_222 {
    private final Production85_222 production = new Production85_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}