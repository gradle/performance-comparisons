package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_225 {
    private final Production66_225 production = new Production66_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}