package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_266 {
    private final Production85_266 production = new Production85_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}