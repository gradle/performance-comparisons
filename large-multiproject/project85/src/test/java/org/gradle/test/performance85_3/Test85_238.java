package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_238 {
    private final Production85_238 production = new Production85_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}