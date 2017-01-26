package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_268 {
    private final Production66_268 production = new Production66_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}