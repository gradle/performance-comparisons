package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_183 {
    private final Production59_183 production = new Production59_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}