package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_172 {
    private final Production66_172 production = new Production66_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}