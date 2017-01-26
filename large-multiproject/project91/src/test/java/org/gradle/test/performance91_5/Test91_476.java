package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_476 {
    private final Production91_476 production = new Production91_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}