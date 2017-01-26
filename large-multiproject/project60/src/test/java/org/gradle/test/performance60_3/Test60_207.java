package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_207 {
    private final Production60_207 production = new Production60_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}