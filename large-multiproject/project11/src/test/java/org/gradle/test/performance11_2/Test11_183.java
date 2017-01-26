package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_183 {
    private final Production11_183 production = new Production11_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}