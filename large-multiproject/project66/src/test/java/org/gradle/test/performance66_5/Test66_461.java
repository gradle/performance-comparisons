package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_461 {
    private final Production66_461 production = new Production66_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}