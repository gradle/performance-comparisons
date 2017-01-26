package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_167 {
    private final Production66_167 production = new Production66_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}