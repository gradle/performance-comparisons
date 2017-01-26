package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_27 {
    private final Production66_27 production = new Production66_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}