package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_183 {
    private final Production79_183 production = new Production79_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}