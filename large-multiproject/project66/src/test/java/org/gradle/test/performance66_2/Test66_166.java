package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_166 {
    private final Production66_166 production = new Production66_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}