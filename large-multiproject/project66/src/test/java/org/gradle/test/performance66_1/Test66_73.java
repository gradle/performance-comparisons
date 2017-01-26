package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_73 {
    private final Production66_73 production = new Production66_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}