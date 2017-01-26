package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_207 {
    private final Production39_207 production = new Production39_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}