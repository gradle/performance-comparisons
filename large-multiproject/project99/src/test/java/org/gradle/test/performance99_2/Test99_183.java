package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_183 {
    private final Production99_183 production = new Production99_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}