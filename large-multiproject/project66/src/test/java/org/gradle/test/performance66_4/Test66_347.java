package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_347 {
    private final Production66_347 production = new Production66_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}