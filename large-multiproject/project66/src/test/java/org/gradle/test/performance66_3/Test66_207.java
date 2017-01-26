package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_207 {
    private final Production66_207 production = new Production66_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}