package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_362 {
    private final Production66_362 production = new Production66_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}