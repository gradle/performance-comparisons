package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_9 {
    private final Production66_9 production = new Production66_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}