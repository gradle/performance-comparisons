package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_199 {
    private final Production66_199 production = new Production66_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}