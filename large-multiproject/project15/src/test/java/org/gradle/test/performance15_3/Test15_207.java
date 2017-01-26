package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_207 {
    private final Production15_207 production = new Production15_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}