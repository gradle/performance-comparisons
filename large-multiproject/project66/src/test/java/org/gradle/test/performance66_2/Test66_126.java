package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_126 {
    private final Production66_126 production = new Production66_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}