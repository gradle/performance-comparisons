package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_267 {
    private final Production39_267 production = new Production39_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}