package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_26 {
    private final Production91_26 production = new Production91_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}