package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_209 {
    private final Production66_209 production = new Production66_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}