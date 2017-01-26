package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_166 {
    private final Production39_166 production = new Production39_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}