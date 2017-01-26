package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_40 {
    private final Production66_40 production = new Production66_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}