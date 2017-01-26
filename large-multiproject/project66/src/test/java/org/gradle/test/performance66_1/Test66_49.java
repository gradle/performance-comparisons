package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_49 {
    private final Production66_49 production = new Production66_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}