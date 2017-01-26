package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_458 {
    private final Production91_458 production = new Production91_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}