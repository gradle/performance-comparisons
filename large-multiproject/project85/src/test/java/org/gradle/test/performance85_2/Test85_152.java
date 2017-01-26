package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_152 {
    private final Production85_152 production = new Production85_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}