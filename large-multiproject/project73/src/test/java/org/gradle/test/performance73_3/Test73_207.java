package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_207 {
    private final Production73_207 production = new Production73_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}