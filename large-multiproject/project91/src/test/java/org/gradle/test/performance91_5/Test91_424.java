package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_424 {
    private final Production91_424 production = new Production91_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}