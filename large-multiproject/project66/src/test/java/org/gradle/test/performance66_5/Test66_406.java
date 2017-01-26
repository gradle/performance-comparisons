package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_406 {
    private final Production66_406 production = new Production66_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}