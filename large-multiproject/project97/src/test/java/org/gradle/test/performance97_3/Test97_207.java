package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_207 {
    private final Production97_207 production = new Production97_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}