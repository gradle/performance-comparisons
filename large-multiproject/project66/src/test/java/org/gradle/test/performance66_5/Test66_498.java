package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_498 {
    private final Production66_498 production = new Production66_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}