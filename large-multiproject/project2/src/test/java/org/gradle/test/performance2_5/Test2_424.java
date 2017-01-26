package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_424 {
    private final Production2_424 production = new Production2_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}