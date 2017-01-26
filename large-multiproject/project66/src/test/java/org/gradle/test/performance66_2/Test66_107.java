package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_107 {
    private final Production66_107 production = new Production66_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}