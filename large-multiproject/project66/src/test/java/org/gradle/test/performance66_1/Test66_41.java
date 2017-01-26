package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_41 {
    private final Production66_41 production = new Production66_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}