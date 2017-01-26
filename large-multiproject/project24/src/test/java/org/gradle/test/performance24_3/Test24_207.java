package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_207 {
    private final Production24_207 production = new Production24_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}