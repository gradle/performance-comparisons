package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_246 {
    private final Production66_246 production = new Production66_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}