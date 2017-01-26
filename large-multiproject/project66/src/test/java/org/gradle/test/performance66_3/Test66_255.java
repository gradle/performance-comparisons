package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_255 {
    private final Production66_255 production = new Production66_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}