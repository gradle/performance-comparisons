package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_225 {
    private final Production39_225 production = new Production39_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}