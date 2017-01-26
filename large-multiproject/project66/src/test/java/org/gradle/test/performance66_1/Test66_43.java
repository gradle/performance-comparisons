package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_43 {
    private final Production66_43 production = new Production66_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}