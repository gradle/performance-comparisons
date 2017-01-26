package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_71 {
    private final Production66_71 production = new Production66_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}