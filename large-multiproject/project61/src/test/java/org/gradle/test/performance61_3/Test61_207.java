package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_207 {
    private final Production61_207 production = new Production61_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}