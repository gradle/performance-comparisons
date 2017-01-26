package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_59 {
    private final Production91_59 production = new Production91_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}