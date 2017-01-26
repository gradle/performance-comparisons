package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_80 {
    private final Production66_80 production = new Production66_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}