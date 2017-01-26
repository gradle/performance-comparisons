package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_207 {
    private final Production72_207 production = new Production72_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}