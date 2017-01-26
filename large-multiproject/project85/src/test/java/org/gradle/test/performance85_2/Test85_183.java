package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_183 {
    private final Production85_183 production = new Production85_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}