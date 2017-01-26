package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_183 {
    private final Production60_183 production = new Production60_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}